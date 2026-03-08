package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SunSnow: ImageVector
    get() {
        if (_SunSnow != null) {
            return _SunSnow!!
        }
        _SunSnow = ImageVector.Builder(
            name = "Outline.SunSnow",
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
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                moveToRelative(4f, -8.5f)
                verticalLineTo(5f)
                moveToRelative(-7f, 7f)
                horizontalLineTo(3.5f)
                moveToRelative(17f, 0f)
                horizontalLineTo(19f)
                moveToRelative(-1f, -6f)
                lineToRelative(-1f, 1f)
                moveTo(6f, 6f)
                lineToRelative(1f, 1f)
                moveToRelative(5.004f, 10.5f)
                lineTo(12f, 17f)
                moveToRelative(4.004f, -1.5f)
                lineTo(16f, 15f)
                moveToRelative(-7.996f, 0.5f)
                lineTo(8f, 15f)
                moveToRelative(4.004f, 6f)
                lineTo(12f, 20.5f)
                moveToRelative(4.004f, -1.5f)
                lineTo(16f, 18.5f)
                moveToRelative(-7.996f, 0.5f)
                lineTo(8f, 18.5f)
            }
        }.build()

        return _SunSnow!!
    }

@Suppress("ObjectPropertyName")
private var _SunSnow: ImageVector? = null
