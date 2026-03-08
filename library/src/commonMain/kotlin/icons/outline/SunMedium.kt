package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SunMedium: ImageVector
    get() {
        if (_SunMedium != null) {
            return _SunMedium!!
        }
        _SunMedium = ImageVector.Builder(
            name = "Outline.SunMedium",
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
                moveToRelative(-4f, -8.5f)
                verticalLineTo(5f)
                moveToRelative(0f, 14.004f)
                verticalLineTo(20.5f)
                moveTo(5f, 12f)
                horizontalLineTo(3.5f)
                moveToRelative(17f, 0f)
                horizontalLineTo(19f)
                moveToRelative(-1f, -6f)
                lineToRelative(-1f, 1f)
                moveTo(6f, 6f)
                lineToRelative(1f, 1f)
                moveToRelative(0f, 10f)
                lineToRelative(-1f, 1f)
                moveToRelative(12f, 0f)
                lineToRelative(-1f, -1f)
            }
        }.build()

        return _SunMedium!!
    }

@Suppress("ObjectPropertyName")
private var _SunMedium: ImageVector? = null
