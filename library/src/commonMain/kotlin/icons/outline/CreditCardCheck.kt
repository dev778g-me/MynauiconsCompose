package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CreditCardCheck: ImageVector
    get() {
        if (_CreditCardCheck != null) {
            return _CreditCardCheck!!
        }
        _CreditCardCheck = ImageVector.Builder(
            name = "Outline.CreditCardCheck",
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
                moveTo(3f, 9f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0f, -1.12f, 0f, -1.68f, 0.218f, -2.108f)
                curveToRelative(0.192f, -0.377f, 0.497f, -0.682f, 0.874f, -0.874f)
                curveTo(4.52f, 5f, 5.08f, 5f, 6.2f, 5f)
                horizontalLineToRelative(6.3f)
                moveTo(3f, 9f)
                horizontalLineToRelative(9.5f)
                moveTo(3f, 9f)
                verticalLineToRelative(6.8f)
                curveToRelative(0f, 1.12f, 0f, 1.68f, 0.218f, 2.108f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.874f, 0.874f)
                curveToRelative(0.427f, 0.218f, 0.987f, 0.218f, 2.105f, 0.218f)
                horizontalLineToRelative(11.606f)
                curveToRelative(1.118f, 0f, 1.677f, 0f, 2.104f, -0.218f)
                curveToRelative(0.377f, -0.192f, 0.683f, -0.498f, 0.875f, -0.874f)
                curveToRelative(0.218f, -0.428f, 0.218f, -0.986f, 0.218f, -2.104f)
                verticalLineTo(11f)
                moveToRelative(-5f, -3.678f)
                lineToRelative(1.484f, 1.576f)
                arcToRelative(0.337f, 0.337f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.502f, -0.022f)
                lineTo(21f, 5f)
                moveTo(6f, 15f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _CreditCardCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardCheck: ImageVector? = null
