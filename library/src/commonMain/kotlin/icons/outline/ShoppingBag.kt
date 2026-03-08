package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) {
            return _ShoppingBag!!
        }
        _ShoppingBag = ImageVector.Builder(
            name = "Outline.ShoppingBag",
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
                moveTo(8.935f, 7f)
                horizontalLineTo(7.773f)
                curveToRelative(-1.072f, 0f, -1.962f, 0.81f, -2.038f, 1.858f)
                lineToRelative(-0.73f, 10f)
                curveTo(4.921f, 20.015f, 5.858f, 21f, 7.043f, 21f)
                horizontalLineToRelative(9.914f)
                curveToRelative(1.185f, 0f, 2.122f, -0.985f, 2.038f, -2.142f)
                lineToRelative(-0.73f, -10f)
                curveTo(18.189f, 7.81f, 17.299f, 7f, 16.227f, 7f)
                horizontalLineToRelative(-1.162f)
                moveToRelative(-6.13f, 0f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.105f, 0.915f, -2f, 2.043f, -2f)
                horizontalLineToRelative(2.044f)
                curveToRelative(1.128f, 0f, 2.043f, 0.895f, 2.043f, 2f)
                verticalLineToRelative(2f)
                moveToRelative(-6.13f, 0f)
                horizontalLineToRelative(6.13f)
            }
        }.build()

        return _ShoppingBag!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBag: ImageVector? = null
