package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Paint: ImageVector
    get() {
        if (_Paint != null) {
            return _Paint!!
        }
        _Paint = ImageVector.Builder(
            name = "Filled.Paint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 2.25f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(10f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 7f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.483f, 0f, 0.815f, 0.09f, 1.003f, 0.213f)
                curveToRelative(0.14f, 0.092f, 0.247f, 0.225f, 0.247f, 0.537f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-7f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.75f, 12f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                verticalLineToRelative(-8f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                horizontalLineToRelative(7f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 9f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.792f, -0.34f, -1.41f, -0.925f, -1.792f)
                curveToRelative(-0.536f, -0.35f, -1.204f, -0.458f, -1.825f, -0.458f)
                horizontalLineToRelative(-0.25f)
                verticalLineTo(4f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, -1.75f)
                close()
            }
        }.build()

        return _Paint!!
    }

@Suppress("ObjectPropertyName")
private var _Paint: ImageVector? = null
