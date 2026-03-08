package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) {
            return _Briefcase!!
        }
        _Briefcase = ImageVector.Builder(
            name = "Filled.Briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.3f, 7.35f)
                horizontalLineToRelative(-0.915f)
                curveToRelative(-1.888f, 0f, -2.761f, 0.433f, -3.173f, 0.91f)
                curveToRelative(-0.408f, 0.473f, -0.534f, 1.188f, -0.424f, 2.203f)
                arcToRelative(14.5f, 14.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.639f, 2.064f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.148f, 0.006f)
                curveToRelative(1.966f, -0.274f, 3.89f, -0.96f, 5.634f, -2.04f)
                curveToRelative(0.116f, -1.03f, -0.01f, -1.755f, -0.421f, -2.233f)
                curveToRelative(-0.412f, -0.477f, -1.285f, -0.91f, -3.173f, -0.91f)
                close()
                moveTo(2.3f, 10.665f)
                curveToRelative(-0.13f, -1.158f, -0.054f, -2.422f, 0.777f, -3.385f)
                curveToRelative(0.834f, -0.968f, 2.254f, -1.43f, 4.308f, -1.43f)
                horizontalLineToRelative(0.173f)
                curveToRelative(0f, -0.378f, 0f, -0.798f, 0.053f, -1.192f)
                curveToRelative(0.055f, -0.41f, 0.174f, -0.853f, 0.454f, -1.25f)
                curveToRelative(0.589f, -0.83f, 1.655f, -1.158f, 3.197f, -1.158f)
                horizontalLineToRelative(1.476f)
                curveToRelative(1.542f, 0f, 2.608f, 0.329f, 3.197f, 1.159f)
                curveToRelative(0.28f, 0.396f, 0.4f, 0.838f, 0.454f, 1.25f)
                curveToRelative(0.053f, 0.393f, 0.053f, 0.813f, 0.053f, 1.191f)
                horizontalLineToRelative(0.173f)
                curveToRelative(2.054f, 0f, 3.474f, 0.462f, 4.308f, 1.43f)
                curveToRelative(0.831f, 0.963f, 0.907f, 2.227f, 0.776f, 3.385f)
                lineToRelative(-0.693f, 7.204f)
                curveToRelative(-0.102f, 0.933f, -0.344f, 1.973f, -1.212f, 2.746f)
                curveToRelative(-0.856f, 0.763f, -2.174f, 1.135f, -4.102f, 1.135f)
                lineTo(8.308f, 21.75f)
                curveToRelative(-1.929f, 0f, -3.246f, -0.372f, -4.102f, -1.135f)
                curveToRelative(-0.868f, -0.773f, -1.11f, -1.812f, -1.212f, -2.746f)
                lineToRelative(-0.002f, -0.01f)
                close()
                moveTo(14.943f, 5.85f)
                curveToRelative(0f, -0.396f, -0.002f, -0.714f, -0.04f, -0.993f)
                curveToRelative(-0.037f, -0.278f, -0.103f, -0.456f, -0.191f, -0.58f)
                curveToRelative(-0.15f, -0.212f, -0.56f, -0.527f, -1.973f, -0.527f)
                horizontalLineToRelative(-1.476f)
                curveToRelative(-1.412f, 0f, -1.823f, 0.315f, -1.973f, 0.526f)
                curveToRelative(-0.088f, 0.125f, -0.154f, 0.303f, -0.191f, 0.581f)
                curveToRelative(-0.038f, 0.28f, -0.04f, 0.597f, -0.04f, 0.993f)
                close()
                moveTo(12f, 12.25f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.5f)
            }
        }.build()

        return _Briefcase!!
    }

@Suppress("ObjectPropertyName")
private var _Briefcase: ImageVector? = null
