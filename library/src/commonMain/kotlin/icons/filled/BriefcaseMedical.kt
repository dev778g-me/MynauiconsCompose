package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BriefcaseMedical: ImageVector
    get() {
        if (_BriefcaseMedical != null) {
            return _BriefcaseMedical!!
        }
        _BriefcaseMedical = ImageVector.Builder(
            name = "Filled.BriefcaseMedical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.245f, 3.951f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.197f, -0.196f)
                lineToRelative(-0.05f, -0.005f)
                horizontalLineTo(10f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.249f, 0.248f)
                verticalLineTo(5.85f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(4f)
                close()
                moveTo(6.465f, 7.39f)
                curveToRelative(-1.265f, 0.117f, -1.914f, 0.478f, -2.252f, 0.87f)
                curveToRelative(-0.413f, 0.479f, -0.538f, 1.206f, -0.421f, 2.242f)
                lineToRelative(0.002f, 0.014f)
                lineToRelative(0.69f, 7.19f)
                lineToRelative(0.04f, 0.298f)
                curveToRelative(0.102f, 0.67f, 0.294f, 1.147f, 0.68f, 1.491f)
                curveToRelative(0.352f, 0.314f, 0.959f, 0.595f, 2.052f, 0.705f)
                arcToRelative(27.36f, 27.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.79f, -12.81f)
                moveToRelative(11.068f, 0f)
                arcToRelative(27.36f, 27.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.79f, 12.81f)
                curveToRelative(1.094f, -0.11f, 1.7f, -0.391f, 2.053f, -0.705f)
                curveToRelative(0.44f, -0.393f, 0.628f, -0.96f, 0.72f, -1.79f)
                lineToRelative(0.691f, -7.19f)
                lineToRelative(0.001f, -0.013f)
                curveToRelative(0.118f, -1.036f, -0.007f, -1.763f, -0.42f, -2.242f)
                curveToRelative(-0.339f, -0.392f, -0.988f, -0.753f, -2.255f, -0.87f)
                moveTo(15.75f, 5.85f)
                horizontalLineToRelative(0.865f)
                curveToRelative(2.054f, 0f, 3.474f, 0.463f, 4.309f, 1.43f)
                curveToRelative(0.832f, 0.965f, 0.906f, 2.232f, 0.774f, 3.392f)
                lineToRelative(-0.69f, 7.186f)
                lineToRelative(-0.001f, 0.011f)
                curveToRelative(-0.103f, 0.934f, -0.346f, 1.974f, -1.213f, 2.746f)
                curveToRelative(-0.856f, 0.763f, -2.174f, 1.135f, -4.102f, 1.135f)
                horizontalLineTo(8.308f)
                curveToRelative(-1.928f, 0f, -3.246f, -0.372f, -4.102f, -1.135f)
                curveToRelative(-0.867f, -0.772f, -1.11f, -1.812f, -1.213f, -2.746f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.691f, -7.187f)
                lineToRelative(-0.04f, -0.44f)
                curveTo(2.2f, 9.2f, 2.349f, 8.125f, 3.077f, 7.28f)
                curveToRelative(0.835f, -0.967f, 2.255f, -1.43f, 4.309f, -1.43f)
                horizontalLineToRelative(0.865f)
                verticalLineTo(4f)
                arcToRelative(1.747f, 1.747f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, -1.75f)
                horizontalLineToRelative(4.004f)
                lineToRelative(0.173f, 0.009f)
                arcToRelative(1.753f, 1.753f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.574f, 1.74f)
                close()
                moveTo(11.25f, 16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.25f)
                horizontalLineTo(14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.25f)
                verticalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.25f)
                horizontalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.25f)
                close()
            }
        }.build()

        return _BriefcaseMedical!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseMedical: ImageVector? = null
