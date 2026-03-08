package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SunDim: ImageVector
    get() {
        if (_SunDim != null) {
            return _SunDim!!
        }
        _SunDim = ImageVector.Builder(
            name = "Outline.SunDim",
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
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                moveToRelative(-4f, -7.5f)
                verticalLineTo(5f)
                moveToRelative(0f, 14.004f)
                verticalLineToRelative(0.496f)
                moveTo(5f, 12f)
                horizontalLineToRelative(-0.5f)
                moveToRelative(15f, 0f)
                horizontalLineTo(19f)
                moveToRelative(-1.5f, -5.5f)
                lineTo(17f, 7f)
                moveTo(6.5f, 6.5f)
                lineTo(7f, 7f)
                moveToRelative(0f, 10f)
                lineToRelative(-0.5f, 0.5f)
                moveToRelative(11f, 0f)
                lineTo(17f, 17f)
            }
        }.build()

        return _SunDim!!
    }

@Suppress("ObjectPropertyName")
private var _SunDim: ImageVector? = null
