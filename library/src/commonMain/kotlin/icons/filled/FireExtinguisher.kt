package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FireExtinguisher: ImageVector
    get() {
        if (_FireExtinguisher != null) {
            return _FireExtinguisher!!
        }
        _FireExtinguisher = ImageVector.Builder(
            name = "Filled.FireExtinguisher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 1.25f)
                horizontalLineToRelative(2f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.466f, 0.803f)
                lineToRelative(0.797f, -0.265f)
                lineToRelative(1.5f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.474f, 1.424f)
                lineToRelative(-2.364f, 0.788f)
                lineToRelative(2.364f, 0.788f)
                lineToRelative(0.072f, 0.028f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.472f, 1.416f)
                lineToRelative(-0.074f, -0.02f)
                lineToRelative(-2.013f, -0.671f)
                verticalLineToRelative(1.137f)
                quadToRelative(0.252f, 0.156f, 0.482f, 0.35f)
                curveToRelative(0.929f, 0.78f, 1.518f, 1.955f, 1.518f, 3.472f)
                verticalLineToRelative(10f)
                arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.75f, 2.75f)
                horizontalLineToRelative(-4f)
                arcTo(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 20f)
                verticalLineTo(10f)
                curveToRelative(0f, -1.753f, 0.843f, -3.002f, 2f, -3.744f)
                verticalLineToRelative(-2.47f)
                curveToRelative(-1.352f, 0.13f, -2.14f, 0.62f, -2.627f, 1.298f)
                curveToRelative(-0.612f, 0.85f, -0.873f, 2.15f, -0.873f, 3.916f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.844f, 0.258f, -3.545f, 1.155f, -4.792f)
                curveToRelative(0.85f, -1.18f, 2.175f, -1.828f, 4.01f, -1.94f)
                arcTo(1.76f, 1.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 1.25f)
            }
        }.build()

        return _FireExtinguisher!!
    }

@Suppress("ObjectPropertyName")
private var _FireExtinguisher: ImageVector? = null
