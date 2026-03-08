package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronsUpRight: ImageVector
    get() {
        if (_ChevronsUpRight != null) {
            return _ChevronsUpRight!!
        }
        _ChevronsUpRight = ImageVector.Builder(
            name = "Outline.ChevronsUpRight",
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
                moveTo(17.743f, 14.743f)
                verticalLineTo(6.257f)
                horizontalLineTo(9.257f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.743f, 18.743f)
                verticalLineToRelative(-8.486f)
                horizontalLineTo(5.257f)
            }
        }.build()

        return _ChevronsUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsUpRight: ImageVector? = null
