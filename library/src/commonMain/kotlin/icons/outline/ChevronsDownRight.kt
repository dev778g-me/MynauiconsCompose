package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronsDownRight: ImageVector
    get() {
        if (_ChevronsDownRight != null) {
            return _ChevronsDownRight!!
        }
        _ChevronsDownRight = ImageVector.Builder(
            name = "Outline.ChevronsDownRight",
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
                moveTo(9.257f, 17.743f)
                horizontalLineToRelative(8.486f)
                verticalLineTo(9.257f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.257f, 13.743f)
                horizontalLineToRelative(8.486f)
                verticalLineTo(5.257f)
            }
        }.build()

        return _ChevronsDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsDownRight: ImageVector? = null
