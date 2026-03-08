package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronsUpLeft: ImageVector
    get() {
        if (_ChevronsUpLeft != null) {
            return _ChevronsUpLeft!!
        }
        _ChevronsUpLeft = ImageVector.Builder(
            name = "Outline.ChevronsUpLeft",
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
                moveTo(14.743f, 6.257f)
                horizontalLineTo(6.257f)
                verticalLineToRelative(8.486f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.743f, 10.257f)
                horizontalLineToRelative(-8.486f)
                verticalLineToRelative(8.486f)
            }
        }.build()

        return _ChevronsUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsUpLeft: ImageVector? = null
