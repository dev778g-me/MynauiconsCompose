package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Accessibility: ImageVector
    get() {
        if (_Accessibility != null) {
            return _Accessibility!!
        }
        _Accessibility = ImageVector.Builder(
            name = "Outline.Accessibility",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                moveTo(8f, 9.5f)
                lineToRelative(4f, 0.778f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, -0.778f)
                moveToRelative(-4f, 0.778f)
                verticalLineToRelative(2.333f)
                moveToRelative(0f, 0f)
                lineTo(10.4f, 16.5f)
                moveToRelative(1.6f, -3.889f)
                lineToRelative(1.6f, 3.889f)
                moveTo(12f, 7.25f)
                verticalLineToRelative(0.5f)
            }
        }.build()

        return _Accessibility!!
    }

@Suppress("ObjectPropertyName")
private var _Accessibility: ImageVector? = null
