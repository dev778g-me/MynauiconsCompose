package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronsDownLeft: ImageVector
    get() {
        if (_ChevronsDownLeft != null) {
            return _ChevronsDownLeft!!
        }
        _ChevronsDownLeft = ImageVector.Builder(
            name = "Outline.ChevronsDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.257f, 9.257f)
                verticalLineToRelative(8.486f)
                horizontalLineToRelative(8.486f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.257f, 5.257f)
                verticalLineToRelative(8.486f)
                horizontalLineToRelative(8.486f)
            }
        }.build()

        return _ChevronsDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsDownLeft: ImageVector? = null
