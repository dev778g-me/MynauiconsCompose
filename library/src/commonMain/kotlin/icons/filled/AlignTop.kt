package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AlignTop: ImageVector
    get() {
        if (_AlignTop != null) {
            return _AlignTop!!
        }
        _AlignTop = ImageVector.Builder(
            name = "Filled.AlignTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2.25f)
                horizontalLineToRelative(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(3f, 3.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 3f)
                moveToRelative(4.725f, 3.25f)
                curveToRelative(-0.445f, 0f, -0.816f, 0f, -1.12f, 0.02f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.907f, 0.19f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.489f, 1.488f)
                curveToRelative(-0.12f, 0.29f, -0.167f, 0.59f, -0.188f, 0.907f)
                curveToRelative(-0.021f, 0.304f, -0.021f, 0.675f, -0.021f, 1.12f)
                verticalLineToRelative(8.05f)
                curveToRelative(0f, 0.445f, 0f, 0.816f, 0.02f, 1.12f)
                curveToRelative(0.022f, 0.317f, 0.069f, 0.617f, 0.19f, 0.907f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.488f, 1.489f)
                curveToRelative(0.29f, 0.12f, 0.59f, 0.167f, 0.907f, 0.188f)
                curveToRelative(0.304f, 0.021f, 0.675f, 0.021f, 1.12f, 0.021f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.445f, 0f, 0.816f, 0f, 1.12f, -0.02f)
                curveToRelative(0.317f, -0.022f, 0.617f, -0.069f, 0.907f, -0.19f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.489f, -1.488f)
                curveToRelative(0.12f, -0.29f, 0.167f, -0.59f, 0.188f, -0.907f)
                curveToRelative(0.021f, -0.304f, 0.021f, -0.675f, 0.021f, -1.12f)
                verticalLineToRelative(-8.05f)
                curveToRelative(0f, -0.445f, 0f, -0.816f, -0.02f, -1.12f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.19f, -0.907f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.488f, -1.489f)
                curveToRelative(-0.29f, -0.12f, -0.59f, -0.167f, -0.907f, -0.188f)
                curveToRelative(-0.304f, -0.021f, -0.675f, -0.021f, -1.12f, -0.021f)
                close()
                moveTo(16.975f, 6.25f)
                curveToRelative(-0.445f, 0f, -0.816f, 0f, -1.12f, 0.02f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.907f, 0.19f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.489f, 1.488f)
                curveToRelative(-0.12f, 0.29f, -0.167f, 0.59f, -0.188f, 0.907f)
                curveToRelative(-0.021f, 0.304f, -0.021f, 0.675f, -0.021f, 1.12f)
                verticalLineToRelative(4.05f)
                curveToRelative(0f, 0.445f, 0f, 0.816f, 0.02f, 1.12f)
                curveToRelative(0.022f, 0.318f, 0.069f, 0.617f, 0.19f, 0.907f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.488f, 1.489f)
                curveToRelative(0.29f, 0.12f, 0.59f, 0.167f, 0.907f, 0.188f)
                curveToRelative(0.304f, 0.021f, 0.675f, 0.021f, 1.12f, 0.021f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.445f, 0f, 0.816f, 0f, 1.12f, -0.02f)
                curveToRelative(0.317f, -0.022f, 0.617f, -0.069f, 0.907f, -0.19f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.489f, -1.488f)
                curveToRelative(0.12f, -0.29f, 0.167f, -0.59f, 0.188f, -0.907f)
                curveToRelative(0.021f, -0.304f, 0.021f, -0.675f, 0.021f, -1.12f)
                verticalLineToRelative(-4.05f)
                curveToRelative(0f, -0.445f, 0f, -0.816f, -0.02f, -1.12f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.19f, -0.907f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.488f, -1.489f)
                curveToRelative(-0.29f, -0.12f, -0.59f, -0.167f, -0.907f, -0.188f)
                curveToRelative(-0.304f, -0.021f, -0.675f, -0.021f, -1.12f, -0.021f)
                close()
            }
        }.build()

        return _AlignTop!!
    }

@Suppress("ObjectPropertyName")
private var _AlignTop: ImageVector? = null
